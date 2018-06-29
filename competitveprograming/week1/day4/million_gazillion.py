import unittest


class Trie(object):

    # Implement a trie and use it to efficiently store strings

    def __init__(self):
        self.way = {}
        self.vist = False

    def insert(self, key):
        if len(key) == 0:
            if key in self.way:
                return False
            else:
                node = Trie()
                node.vist = True
                self.way[key] = node
                return True
        root = key[0]
        if root in self.way:
            node = self.way[root]
        else:
            node = Trie()
            self.way[root] = node

        if len(key) > 1:
            remains = key[1:]
            return node.insert(remains)
        else:
            if node.vist:
                return False
            else:
                self.way[root].vist = True
                return True  

# Tests

class Test(unittest.TestCase):

    def test_trie_usage(self):
        trie = Trie()

        result = trie.insert('catch')
        self.assertTrue(result, msg='new word 1')

        result = trie.insert('cakes')
        self.assertTrue(result, msg='new word 2')

        result = trie.insert('cake')
        self.assertTrue(result, msg='prefix of existing word')

        result = trie.insert('cake')
        self.assertFalse(result, msg='word already present')

        result = trie.insert('caked')
        self.assertTrue(result, msg='new word 3')

        result = trie.insert('catch')
        self.assertFalse(result, msg='all words still present')

        result = trie.insert('')
        self.assertTrue(result, msg='empty word')

        result = trie.insert('')
        self.assertFalse(result, msg='empty word present')


unittest.main(verbosity=2)